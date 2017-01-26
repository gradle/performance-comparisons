package org.gradle.test.performancenull_417;

import static org.junit.Assert.*;

public class Testnull_41679 {
    private final Productionnull_41679 production = new Productionnull_41679("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}