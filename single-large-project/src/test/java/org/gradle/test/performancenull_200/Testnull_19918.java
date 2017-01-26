package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19918 {
    private final Productionnull_19918 production = new Productionnull_19918("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}