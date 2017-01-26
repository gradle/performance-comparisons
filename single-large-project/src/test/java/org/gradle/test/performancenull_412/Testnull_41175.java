package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41175 {
    private final Productionnull_41175 production = new Productionnull_41175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}