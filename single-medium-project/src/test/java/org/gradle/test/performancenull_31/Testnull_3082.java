package org.gradle.test.performancenull_31;

import static org.junit.Assert.*;

public class Testnull_3082 {
    private final Productionnull_3082 production = new Productionnull_3082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}