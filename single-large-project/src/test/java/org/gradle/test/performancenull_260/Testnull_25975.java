package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25975 {
    private final Productionnull_25975 production = new Productionnull_25975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}