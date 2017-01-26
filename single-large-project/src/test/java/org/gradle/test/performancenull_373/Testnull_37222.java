package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37222 {
    private final Productionnull_37222 production = new Productionnull_37222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}