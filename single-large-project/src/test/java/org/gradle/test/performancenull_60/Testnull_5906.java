package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5906 {
    private final Productionnull_5906 production = new Productionnull_5906("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}