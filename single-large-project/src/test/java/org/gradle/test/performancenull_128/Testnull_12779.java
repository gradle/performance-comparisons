package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12779 {
    private final Productionnull_12779 production = new Productionnull_12779("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}