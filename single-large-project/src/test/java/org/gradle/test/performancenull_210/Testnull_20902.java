package org.gradle.test.performancenull_210;

import static org.junit.Assert.*;

public class Testnull_20902 {
    private final Productionnull_20902 production = new Productionnull_20902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}