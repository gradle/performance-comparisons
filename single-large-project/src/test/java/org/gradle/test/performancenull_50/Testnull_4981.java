package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4981 {
    private final Productionnull_4981 production = new Productionnull_4981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}