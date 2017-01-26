package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14961 {
    private final Productionnull_14961 production = new Productionnull_14961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}