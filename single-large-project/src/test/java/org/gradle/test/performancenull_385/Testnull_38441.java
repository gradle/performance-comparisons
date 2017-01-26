package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38441 {
    private final Productionnull_38441 production = new Productionnull_38441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}