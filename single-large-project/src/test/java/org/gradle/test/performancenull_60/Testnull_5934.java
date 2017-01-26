package org.gradle.test.performancenull_60;

import static org.junit.Assert.*;

public class Testnull_5934 {
    private final Productionnull_5934 production = new Productionnull_5934("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}