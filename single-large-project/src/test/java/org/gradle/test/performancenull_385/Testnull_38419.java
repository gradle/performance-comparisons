package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38419 {
    private final Productionnull_38419 production = new Productionnull_38419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}