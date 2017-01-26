package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20191 {
    private final Productionnull_20191 production = new Productionnull_20191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}