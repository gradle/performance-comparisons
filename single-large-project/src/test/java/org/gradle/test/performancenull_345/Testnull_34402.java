package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34402 {
    private final Productionnull_34402 production = new Productionnull_34402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}