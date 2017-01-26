package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4282 {
    private final Productionnull_4282 production = new Productionnull_4282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}