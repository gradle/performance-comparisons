package org.gradle.test.performancenull_415;

import static org.junit.Assert.*;

public class Testnull_41463 {
    private final Productionnull_41463 production = new Productionnull_41463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}