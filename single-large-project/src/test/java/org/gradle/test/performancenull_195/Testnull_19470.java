package org.gradle.test.performancenull_195;

import static org.junit.Assert.*;

public class Testnull_19470 {
    private final Productionnull_19470 production = new Productionnull_19470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}