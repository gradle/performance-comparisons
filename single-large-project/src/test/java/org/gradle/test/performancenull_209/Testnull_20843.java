package org.gradle.test.performancenull_209;

import static org.junit.Assert.*;

public class Testnull_20843 {
    private final Productionnull_20843 production = new Productionnull_20843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}