package org.gradle.test.performancenull_14;

import static org.junit.Assert.*;

public class Testnull_1303 {
    private final Productionnull_1303 production = new Productionnull_1303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}