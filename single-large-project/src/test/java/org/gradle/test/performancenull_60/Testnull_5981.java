package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5981 {
    private final Productionnull_5981 production = new Productionnull_5981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}