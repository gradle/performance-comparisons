package org.gradle.test.performancenull_199;

import static org.junit.Assert.*;

public class Testnull_19843 {
    private final Productionnull_19843 production = new Productionnull_19843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}