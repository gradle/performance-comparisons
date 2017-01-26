package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4258 {
    private final Productionnull_4258 production = new Productionnull_4258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}