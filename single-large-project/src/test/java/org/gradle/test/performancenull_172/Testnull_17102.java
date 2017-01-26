package org.gradle.test.performancenull_172;

import static org.junit.Assert.*;

public class Testnull_17102 {
    private final Productionnull_17102 production = new Productionnull_17102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}