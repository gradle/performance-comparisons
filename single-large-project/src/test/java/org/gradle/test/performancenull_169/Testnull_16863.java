package org.gradle.test.performancenull_169;

import static org.junit.Assert.*;

public class Testnull_16863 {
    private final Productionnull_16863 production = new Productionnull_16863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}