package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5976 {
    private final Productionnull_5976 production = new Productionnull_5976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}