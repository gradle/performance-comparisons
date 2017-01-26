package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14082 {
    private final Productionnull_14082 production = new Productionnull_14082("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}