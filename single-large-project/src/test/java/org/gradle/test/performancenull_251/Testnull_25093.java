package org.gradle.test.performancenull_251;

import static org.junit.Assert.*;

public class Testnull_25093 {
    private final Productionnull_25093 production = new Productionnull_25093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}