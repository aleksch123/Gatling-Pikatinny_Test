package ru.domrf.dominvest.pageobject;


import io.gatling.javaapi.core.ChainBuilder;


import ru.domrf.dominvest.DomInvestClient;





import static io.gatling.javaapi.core.CoreDsl.*;


public class CreateOperation  {

    public static ChainBuilder call =

                    group("TC:CreateOperation").on(

                          //  exec(org.galaxio.gatling.javaapi.Transactions.startTransaction("r1"))
                                    exec(

                                        session -> {
                                        DomInvestClient.call(session.get("accessToken"));

                                      return session;
                                    })
                                   // .exec(org.galaxio.gatling.javaapi.Transactions.endTransaction("r1"))

                    );
}
