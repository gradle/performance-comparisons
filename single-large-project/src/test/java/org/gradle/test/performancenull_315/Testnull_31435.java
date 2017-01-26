package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31435 {
    private final Productionnull_31435 production = new Productionnull_31435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}