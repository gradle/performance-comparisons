package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33965 {
    private final Productionnull_33965 production = new Productionnull_33965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}