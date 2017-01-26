package org.gradle.test.performancenull_103;

import static org.junit.Assert.*;

public class Testnull_10213 {
    private final Productionnull_10213 production = new Productionnull_10213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}