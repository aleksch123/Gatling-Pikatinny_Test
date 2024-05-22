var stats = {
    type: "GROUP",
name: "All Requests",
path: "",
pathFormatted: "group_missing-name-b06d1",
stats: {
    "name": "All Requests",
    "numberOfRequests": {
        "total": "64",
        "ok": "64",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "17",
        "ok": "17",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "345",
        "ok": "345",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "38",
        "ok": "38",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "59",
        "ok": "59",
        "ko": "-"
    },
    "percentiles1": {
        "total": "22",
        "ok": "22",
        "ko": "-"
    },
    "percentiles2": {
        "total": "24",
        "ok": "24",
        "ko": "-"
    },
    "percentiles3": {
        "total": "116",
        "ok": "116",
        "ko": "-"
    },
    "percentiles4": {
        "total": "298",
        "ok": "298",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 64,
    "percentage": 100
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.818",
        "ok": "5.818",
        "ko": "-"
    }
},
contents: {
"group_tc-grpc-f8853": {
          type: "GROUP",
name: "TC:gRPC",
path: "TC:gRPC",
pathFormatted: "group_tc-grpc-f8853",
stats: {
    "name": "TC:gRPC",
    "numberOfRequests": {
        "total": "65",
        "ok": "65",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "17",
        "ok": "17",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "345",
        "ok": "345",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "37",
        "ok": "37",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "59",
        "ok": "59",
        "ko": "-"
    },
    "percentiles1": {
        "total": "22",
        "ok": "22",
        "ko": "-"
    },
    "percentiles2": {
        "total": "24",
        "ok": "24",
        "ko": "-"
    },
    "percentiles3": {
        "total": "112",
        "ok": "112",
        "ko": "-"
    },
    "percentiles4": {
        "total": "298",
        "ok": "298",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 65,
    "percentage": 100
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.909",
        "ok": "5.909",
        "ko": "-"
    }
},
contents: {
"req_post--auth-real-d7ed1": {
        type: "REQUEST",
        name: "POST /auth/realms/internal-bank-idm/protocol/openid-connect/token",
path: "TC:gRPC / POST /auth/realms/internal-bank-idm/protocol/openid-connect/token",
pathFormatted: "req_tc-grpc---post--0ab38",
stats: {
    "name": "POST /auth/realms/internal-bank-idm/protocol/openid-connect/token",
    "numberOfRequests": {
        "total": "64",
        "ok": "64",
        "ko": "0"
    },
    "minResponseTime": {
        "total": "17",
        "ok": "17",
        "ko": "-"
    },
    "maxResponseTime": {
        "total": "345",
        "ok": "345",
        "ko": "-"
    },
    "meanResponseTime": {
        "total": "38",
        "ok": "38",
        "ko": "-"
    },
    "standardDeviation": {
        "total": "59",
        "ok": "59",
        "ko": "-"
    },
    "percentiles1": {
        "total": "22",
        "ok": "22",
        "ko": "-"
    },
    "percentiles2": {
        "total": "24",
        "ok": "24",
        "ko": "-"
    },
    "percentiles3": {
        "total": "116",
        "ok": "116",
        "ko": "-"
    },
    "percentiles4": {
        "total": "298",
        "ok": "298",
        "ko": "-"
    },
    "group1": {
    "name": "t < 800 ms",
    "htmlName": "t < 800 ms",
    "count": 64,
    "percentage": 100
},
    "group2": {
    "name": "800 ms <= t < 1200 ms",
    "htmlName": "t >= 800 ms <br> t < 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group3": {
    "name": "t >= 1200 ms",
    "htmlName": "t >= 1200 ms",
    "count": 0,
    "percentage": 0
},
    "group4": {
    "name": "failed",
    "htmlName": "failed",
    "count": 0,
    "percentage": 0
},
    "meanNumberOfRequestsPerSecond": {
        "total": "5.818",
        "ok": "5.818",
        "ko": "-"
    }
}
    }
}

     }
}

}

function fillStats(stat){
    $("#numberOfRequests").append(stat.numberOfRequests.total);
    $("#numberOfRequestsOK").append(stat.numberOfRequests.ok);
    $("#numberOfRequestsKO").append(stat.numberOfRequests.ko);

    $("#minResponseTime").append(stat.minResponseTime.total);
    $("#minResponseTimeOK").append(stat.minResponseTime.ok);
    $("#minResponseTimeKO").append(stat.minResponseTime.ko);

    $("#maxResponseTime").append(stat.maxResponseTime.total);
    $("#maxResponseTimeOK").append(stat.maxResponseTime.ok);
    $("#maxResponseTimeKO").append(stat.maxResponseTime.ko);

    $("#meanResponseTime").append(stat.meanResponseTime.total);
    $("#meanResponseTimeOK").append(stat.meanResponseTime.ok);
    $("#meanResponseTimeKO").append(stat.meanResponseTime.ko);

    $("#standardDeviation").append(stat.standardDeviation.total);
    $("#standardDeviationOK").append(stat.standardDeviation.ok);
    $("#standardDeviationKO").append(stat.standardDeviation.ko);

    $("#percentiles1").append(stat.percentiles1.total);
    $("#percentiles1OK").append(stat.percentiles1.ok);
    $("#percentiles1KO").append(stat.percentiles1.ko);

    $("#percentiles2").append(stat.percentiles2.total);
    $("#percentiles2OK").append(stat.percentiles2.ok);
    $("#percentiles2KO").append(stat.percentiles2.ko);

    $("#percentiles3").append(stat.percentiles3.total);
    $("#percentiles3OK").append(stat.percentiles3.ok);
    $("#percentiles3KO").append(stat.percentiles3.ko);

    $("#percentiles4").append(stat.percentiles4.total);
    $("#percentiles4OK").append(stat.percentiles4.ok);
    $("#percentiles4KO").append(stat.percentiles4.ko);

    $("#meanNumberOfRequestsPerSecond").append(stat.meanNumberOfRequestsPerSecond.total);
    $("#meanNumberOfRequestsPerSecondOK").append(stat.meanNumberOfRequestsPerSecond.ok);
    $("#meanNumberOfRequestsPerSecondKO").append(stat.meanNumberOfRequestsPerSecond.ko);
}
