package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21526 {
    private final Productionnull_21526 production = new Productionnull_21526("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}