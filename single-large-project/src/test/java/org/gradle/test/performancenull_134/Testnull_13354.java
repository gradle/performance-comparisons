package org.gradle.test.performancenull_134;

import static org.junit.Assert.*;

public class Testnull_13354 {
    private final Productionnull_13354 production = new Productionnull_13354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}