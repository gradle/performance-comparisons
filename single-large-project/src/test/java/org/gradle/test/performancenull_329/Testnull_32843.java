package org.gradle.test.performancenull_329;

import static org.junit.Assert.*;

public class Testnull_32843 {
    private final Productionnull_32843 production = new Productionnull_32843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}