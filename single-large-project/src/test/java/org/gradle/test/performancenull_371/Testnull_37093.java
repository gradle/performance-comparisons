package org.gradle.test.performancenull_371;

import static org.junit.Assert.*;

public class Testnull_37093 {
    private final Productionnull_37093 production = new Productionnull_37093("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}