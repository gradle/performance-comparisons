package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38456 {
    private final Productionnull_38456 production = new Productionnull_38456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}