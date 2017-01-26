package org.gradle.test.performancenull_180;

import static org.junit.Assert.*;

public class Testnull_17965 {
    private final Productionnull_17965 production = new Productionnull_17965("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}