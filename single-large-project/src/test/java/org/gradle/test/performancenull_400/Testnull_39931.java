package org.gradle.test.performancenull_400;

import static org.junit.Assert.*;

public class Testnull_39931 {
    private final Productionnull_39931 production = new Productionnull_39931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}