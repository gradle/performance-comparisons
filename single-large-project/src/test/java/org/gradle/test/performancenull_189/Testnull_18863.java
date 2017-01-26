package org.gradle.test.performancenull_189;

import static org.junit.Assert.*;

public class Testnull_18863 {
    private final Productionnull_18863 production = new Productionnull_18863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}