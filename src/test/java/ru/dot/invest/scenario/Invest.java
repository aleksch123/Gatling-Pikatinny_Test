package ru.dot.invest.scenario;


import io.gatling.javaapi.core.ScenarioBuilder;
import org.galaxio.gatling.transactions.Predef;
import ru.dot.invest.pageobject.CreateOperation;
import ru.domrf.dominvest.pageobject.Login;
import ru.dot.invest.base.BaseTest;

import static io.gatling.javaapi.core.CoreDsl.exec;

import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.core.OpenInjectionStep.atOnceUsers;


public class Invest extends Predef.SimulationWithTransactions {

    private static final ScenarioBuilder defaultTest =
            scenario("Default Load Test")
                    .exec(org.galaxio.gatling.javaapi.Transactions.startTransaction("tr1"))
                    .exec(CreateOperation.call)
                    .exec(org.galaxio.gatling.javaapi.Transactions.endTransaction("tr1"));





    {
        setUp(
                defaultTest.injectOpen(atOnceUsers(1))).protocols(BaseTest.httpProtocol);

    }




}






