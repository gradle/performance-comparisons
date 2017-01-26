package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39978 {
    private final Productionnull_39978 production = new Productionnull_39978("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}