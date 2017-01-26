package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5931 {
    private final Productionnull_5931 production = new Productionnull_5931("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}