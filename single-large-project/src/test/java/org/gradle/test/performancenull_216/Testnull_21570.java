package org.gradle.test.performancenull_216;

import static org.junit.Assert.*;

public class Testnull_21570 {
    private final Productionnull_21570 production = new Productionnull_21570("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}