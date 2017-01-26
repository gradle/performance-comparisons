package org.gradle.test.performancenull_345;

import static org.junit.Assert.*;

public class Testnull_34492 {
    private final Productionnull_34492 production = new Productionnull_34492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}