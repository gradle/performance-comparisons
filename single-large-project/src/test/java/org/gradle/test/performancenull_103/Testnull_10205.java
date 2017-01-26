package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10205 {
    private final Productionnull_10205 production = new Productionnull_10205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}