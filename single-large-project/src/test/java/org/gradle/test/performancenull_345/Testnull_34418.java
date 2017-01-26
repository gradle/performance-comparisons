package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34418 {
    private final Productionnull_34418 production = new Productionnull_34418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}