package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34917 {
    private final Productionnull_34917 production = new Productionnull_34917("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}