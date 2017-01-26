package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34500 {
    private final Productionnull_34500 production = new Productionnull_34500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}