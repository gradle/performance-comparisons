package org.gradle.test.performancenull_51;

import static org.junit.Assert.*;

public class Testnull_5096 {
    private final Productionnull_5096 production = new Productionnull_5096("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}