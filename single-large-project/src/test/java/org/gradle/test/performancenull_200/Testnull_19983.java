package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19983 {
    private final Productionnull_19983 production = new Productionnull_19983("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}