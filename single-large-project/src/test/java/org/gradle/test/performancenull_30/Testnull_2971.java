package org.gradle.test.performancenull_30;

import static org.junit.Assert.*;

public class Testnull_2971 {
    private final Productionnull_2971 production = new Productionnull_2971("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}