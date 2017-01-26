package org.gradle.test.performancenull_91;

import static org.junit.Assert.*;

public class Testnull_9075 {
    private final Productionnull_9075 production = new Productionnull_9075("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}