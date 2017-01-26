package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30473 {
    private final Productionnull_30473 production = new Productionnull_30473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}