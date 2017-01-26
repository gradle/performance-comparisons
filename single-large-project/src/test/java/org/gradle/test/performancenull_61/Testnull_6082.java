package org.gradle.test.performancenull_61;

import static org.junit.Assert.*;

public class Testnull_6082 {
    private final Productionnull_6082 production = new Productionnull_6082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}