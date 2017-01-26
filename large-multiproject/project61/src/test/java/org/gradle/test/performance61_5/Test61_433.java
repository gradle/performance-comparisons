package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_433 {
    private final Production61_433 production = new Production61_433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}