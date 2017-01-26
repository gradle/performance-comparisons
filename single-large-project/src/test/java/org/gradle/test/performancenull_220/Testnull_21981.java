package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21981 {
    private final Productionnull_21981 production = new Productionnull_21981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}