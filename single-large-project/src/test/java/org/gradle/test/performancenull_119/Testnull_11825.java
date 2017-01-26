package org.gradle.test.performancenull_119;

import static org.junit.Assert.*;

public class Testnull_11825 {
    private final Productionnull_11825 production = new Productionnull_11825("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}