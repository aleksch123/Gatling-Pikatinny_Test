package ru.domrf.dominvest.scenario;


import io.gatling.javaapi.core.PopulationBuilder;

import io.gatling.javaapi.core.ScenarioBuilder;
import org.galaxio.gatling.transactions.Predef;
import ru.domrf.dominvest.pageobject.CreateOperation;
import ru.domrf.dominvest.pageobject.Login;

import static io.gatling.javaapi.core.CoreDsl.exec;

import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.core.OpenInjectionStep.atOnceUsers;


import static ru.domrf.dominvest.base.BaseTest.httpProtocol;


public class Invest extends Predef.SimulationWithTransactions {

    private static final ScenarioBuilder defaultTest =
            scenario("Default Load Test")
                    .exec(org.galaxio.gatling.javaapi.Transactions.startTransaction("tr1"))
                    .exec(CreateOperation.call)
                    .exec(org.galaxio.gatling.javaapi.Transactions.endTransaction("tr1"));





    {
        setUp(
                defaultTest.injectOpen(atOnceUsers(1))).protocols(httpProtocol);

    }




}






