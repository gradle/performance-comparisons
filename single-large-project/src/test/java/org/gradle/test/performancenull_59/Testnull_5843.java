package org.gradle.test.performancenull_59;

import static org.junit.Assert.*;

public class Testnull_5843 {
    private final Productionnull_5843 production = new Productionnull_5843("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}