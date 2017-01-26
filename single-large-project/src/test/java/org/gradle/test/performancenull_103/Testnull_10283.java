package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10283 {
    private final Productionnull_10283 production = new Productionnull_10283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}