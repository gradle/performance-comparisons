package org.gradle.test.performancenull_138;

import static org.junit.Assert.*;

public class Testnull_13786 {
    private final Productionnull_13786 production = new Productionnull_13786("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}