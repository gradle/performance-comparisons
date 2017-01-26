package org.gradle.test.performancenull_53;

import static org.junit.Assert.*;

public class Testnull_5298 {
    private final Productionnull_5298 production = new Productionnull_5298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}