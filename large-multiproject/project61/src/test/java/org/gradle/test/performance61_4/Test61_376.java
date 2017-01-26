package org.gradle.test.performance61_4;

import static org.junit.Assert.*;

public class Test61_376 {
    private final Production61_376 production = new Production61_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}