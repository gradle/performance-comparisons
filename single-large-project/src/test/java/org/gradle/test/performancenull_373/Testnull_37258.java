package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37258 {
    private final Productionnull_37258 production = new Productionnull_37258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}