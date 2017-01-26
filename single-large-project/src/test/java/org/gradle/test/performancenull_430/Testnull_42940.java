package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42940 {
    private final Productionnull_42940 production = new Productionnull_42940("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}