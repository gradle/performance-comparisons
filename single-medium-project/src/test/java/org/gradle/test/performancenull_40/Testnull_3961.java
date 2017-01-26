package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3961 {
    private final Productionnull_3961 production = new Productionnull_3961("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}