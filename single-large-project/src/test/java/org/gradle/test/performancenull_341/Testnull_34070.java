package org.gradle.test.performancenull_341;

import static org.junit.Assert.*;

public class Testnull_34070 {
    private final Productionnull_34070 production = new Productionnull_34070("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}