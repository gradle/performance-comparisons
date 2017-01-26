package org.gradle.test.performancenull_50;

import static org.junit.Assert.*;

public class Testnull_4931 {
    private final Productionnull_4931 production = new Productionnull_4931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}