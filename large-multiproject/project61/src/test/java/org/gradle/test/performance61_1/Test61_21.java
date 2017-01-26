package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_21 {
    private final Production61_21 production = new Production61_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}