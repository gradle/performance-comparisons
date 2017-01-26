package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20121 {
    private final Productionnull_20121 production = new Productionnull_20121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}