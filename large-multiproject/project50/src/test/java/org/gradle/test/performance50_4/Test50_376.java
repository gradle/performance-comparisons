package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_376 {
    private final Production50_376 production = new Production50_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}