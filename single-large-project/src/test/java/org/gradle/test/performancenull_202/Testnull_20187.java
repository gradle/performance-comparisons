package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20187 {
    private final Productionnull_20187 production = new Productionnull_20187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}