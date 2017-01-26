package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27081 {
    private final Productionnull_27081 production = new Productionnull_27081("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}