package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40887 {
    private final Productionnull_40887 production = new Productionnull_40887("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}