package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7143 {
    private final Productionnull_7143 production = new Productionnull_7143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}