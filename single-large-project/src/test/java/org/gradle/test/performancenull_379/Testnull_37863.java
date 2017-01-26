package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37863 {
    private final Productionnull_37863 production = new Productionnull_37863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}