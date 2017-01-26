package org.gradle.test.performancenull_36;

import static org.junit.Assert.*;

public class Testnull_3570 {
    private final Productionnull_3570 production = new Productionnull_3570("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}