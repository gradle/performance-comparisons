package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4805 {
    private final Productionnull_4805 production = new Productionnull_4805("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}