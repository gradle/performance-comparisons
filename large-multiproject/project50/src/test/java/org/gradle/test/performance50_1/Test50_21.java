package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_21 {
    private final Production50_21 production = new Production50_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}