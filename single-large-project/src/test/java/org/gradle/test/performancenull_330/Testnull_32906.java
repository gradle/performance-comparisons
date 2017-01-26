package org.gradle.test.performancenull_330;

import static org.junit.Assert.*;

public class Testnull_32906 {
    private final Productionnull_32906 production = new Productionnull_32906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}