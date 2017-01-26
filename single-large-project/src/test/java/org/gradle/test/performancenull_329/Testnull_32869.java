package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32869 {
    private final Productionnull_32869 production = new Productionnull_32869("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}