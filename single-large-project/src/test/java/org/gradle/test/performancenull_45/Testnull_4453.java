package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4453 {
    private final Productionnull_4453 production = new Productionnull_4453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}