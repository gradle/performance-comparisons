package org.gradle.test.performancenull_405;

import static org.junit.Assert.*;

public class Testnull_40469 {
    private final Productionnull_40469 production = new Productionnull_40469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}