package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34401 {
    private final Productionnull_34401 production = new Productionnull_34401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}