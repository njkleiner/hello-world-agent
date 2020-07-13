package com.njkleiner.inject.dummy;

import java.lang.instrument.Instrumentation;

public class Agent {

    public static void premain(String arguments, Instrumentation instrumentation) {
        System.out.println("[premain] Hello World");
    }

    public static void agentmain(String arguments, Instrumentation instrumentation) {
        System.out.println("[agentmain] Hello World");
    }

}
