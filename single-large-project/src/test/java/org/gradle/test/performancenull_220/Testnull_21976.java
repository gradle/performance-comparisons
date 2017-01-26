package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21976 {
    private final Productionnull_21976 production = new Productionnull_21976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}