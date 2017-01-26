package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4273 {
    private final Productionnull_4273 production = new Productionnull_4273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}