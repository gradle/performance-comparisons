package org.gradle.test.performancenull_170;

import static org.junit.Assert.*;

public class Testnull_16902 {
    private final Productionnull_16902 production = new Productionnull_16902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}