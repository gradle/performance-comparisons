package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_402 {
    private final Production50_402 production = new Production50_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}