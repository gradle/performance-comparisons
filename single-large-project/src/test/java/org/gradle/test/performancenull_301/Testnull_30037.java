package org.gradle.test.performancenull_301;

import static org.junit.Assert.*;

public class Testnull_30037 {
    private final Productionnull_30037 production = new Productionnull_30037("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}