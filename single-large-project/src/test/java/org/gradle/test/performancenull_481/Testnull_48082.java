package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48082 {
    private final Productionnull_48082 production = new Productionnull_48082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}