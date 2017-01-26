package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_394 {
    private final Production50_394 production = new Production50_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}