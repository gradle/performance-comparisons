package org.gradle.test.performancenull_231;

import static org.junit.Assert.*;

public class Testnull_23082 {
    private final Productionnull_23082 production = new Productionnull_23082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}