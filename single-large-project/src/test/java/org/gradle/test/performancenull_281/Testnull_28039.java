package org.gradle.test.performancenull_281;

import static org.junit.Assert.*;

public class Testnull_28039 {
    private final Productionnull_28039 production = new Productionnull_28039("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}