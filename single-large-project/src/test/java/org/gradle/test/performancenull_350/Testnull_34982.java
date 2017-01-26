package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34982 {
    private final Productionnull_34982 production = new Productionnull_34982("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}