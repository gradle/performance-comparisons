package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_26981 {
    private final Productionnull_26981 production = new Productionnull_26981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}