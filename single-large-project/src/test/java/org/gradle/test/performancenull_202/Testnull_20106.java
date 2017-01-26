package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20106 {
    private final Productionnull_20106 production = new Productionnull_20106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}