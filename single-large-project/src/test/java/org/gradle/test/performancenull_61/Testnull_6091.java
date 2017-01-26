package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6091 {
    private final Productionnull_6091 production = new Productionnull_6091("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}