package org.gradle.test.performancenull_43;

import static org.junit.Assert.*;

public class Testnull_4231 {
    private final Productionnull_4231 production = new Productionnull_4231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}