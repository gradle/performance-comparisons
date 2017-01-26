package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_110 {
    private final Production61_110 production = new Production61_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}