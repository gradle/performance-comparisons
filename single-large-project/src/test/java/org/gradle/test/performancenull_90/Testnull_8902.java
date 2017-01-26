package org.gradle.test.performancenull_90;

import static org.junit.Assert.*;

public class Testnull_8902 {
    private final Productionnull_8902 production = new Productionnull_8902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}