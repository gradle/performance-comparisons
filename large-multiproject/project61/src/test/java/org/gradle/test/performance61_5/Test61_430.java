package org.gradle.test.performance61_5;

import static org.junit.Assert.*;

public class Test61_430 {
    private final Production61_430 production = new Production61_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}