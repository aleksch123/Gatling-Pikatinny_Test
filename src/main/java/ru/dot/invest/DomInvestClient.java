package ru.dot.invest;


import dominvest.backend.core.model.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.stub.MetadataUtils;

import java.time.LocalDateTime;

import static dominvest.backend.core.model.txn.TransactionTypeOuterClass.*;

public class DomInvestClient {

    public static void call(String token) {

        String uuid =java.util.UUID.randomUUID().toString();
        Decimal decimal = Decimal.newBuilder().setValue(1).setScale(0).build();
        Date date =Date.newBuilder().setDd(LocalDateTime.now().getDayOfMonth()).setMm(LocalDateTime.now().getMonthValue()).setYyyy(LocalDateTime.now().getYear()).build();
        Time time=Time.newBuilder().setMm(LocalDateTime.now().getMinute()).setHh(LocalDateTime.now().getHour()).setSs(LocalDateTime.now().getSecond()).build();
        DateTime dateTime = DateTime.newBuilder().setDate(date).setTime(time).build();
        Metadata header=new Metadata();
        Metadata.Key<String> key =  Metadata.Key.of("Content-type", Metadata.ASCII_STRING_MARSHALLER);
        header.put(key, "application/json");
        key =  Metadata.Key.of("Authorization",Metadata.ASCII_STRING_MARSHALLER);
        header.put(key, "Bearer "+token);




        ManagedChannel channel = ManagedChannelBuilder
                .forTarget("test:443")
                .build();



        PortfolioServiceGrpc.PortfolioServiceBlockingStub stub = PortfolioServiceGrpc.newBlockingStub(channel);



         TransactionCreateRequest request =TransactionCreateRequest.newBuilder()
                .setRequestId(uuid)
                .setClientId("1565093001")
                .setTransactionType(TransactionType.WITHDRAW)
                .setCurrency("RUB")
                .setQty(decimal)
                .setIdempotencyKey(uuid)
                .setOperationDate(dateTime)
                .setOperationId(uuid)
                .build();

        TransactionCreateResponse response = stub.withWaitForReady().withInterceptors(MetadataUtils.newAttachHeadersInterceptor(header)).createOperation(request);





        System.out.println(request.getRequestId());

        System.out.println(response.hasError());
        channel.shutdown();


    }




}
