package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_430 {
    private final Production50_430 production = new Production50_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}