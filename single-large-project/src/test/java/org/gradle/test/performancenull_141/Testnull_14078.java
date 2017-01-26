package org.gradle.test.performancenull_141;

import static org.junit.Assert.*;

public class Testnull_14078 {
    private final Productionnull_14078 production = new Productionnull_14078("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}