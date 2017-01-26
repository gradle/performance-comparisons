package org.gradle.test.performancenull_403;

import static org.junit.Assert.*;

public class Testnull_40267 {
    private final Productionnull_40267 production = new Productionnull_40267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}