package org.gradle.test.performancenull_486;

import static org.junit.Assert.*;

public class Testnull_48531 {
    private final Productionnull_48531 production = new Productionnull_48531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}