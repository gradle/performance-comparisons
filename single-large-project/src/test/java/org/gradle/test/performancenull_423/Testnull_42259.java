package org.gradle.test.performancenull_423;

import static org.junit.Assert.*;

public class Testnull_42259 {
    private final Productionnull_42259 production = new Productionnull_42259("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}