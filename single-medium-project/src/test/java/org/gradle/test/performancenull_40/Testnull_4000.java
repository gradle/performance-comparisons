package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_4000 {
    private final Productionnull_4000 production = new Productionnull_4000("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}