package org.gradle.test.performancenull_373;

import static org.junit.Assert.*;

public class Testnull_37281 {
    private final Productionnull_37281 production = new Productionnull_37281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}