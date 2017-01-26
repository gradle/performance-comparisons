package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10255 {
    private final Productionnull_10255 production = new Productionnull_10255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}