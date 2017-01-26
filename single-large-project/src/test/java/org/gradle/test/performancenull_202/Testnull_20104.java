package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20104 {
    private final Productionnull_20104 production = new Productionnull_20104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}