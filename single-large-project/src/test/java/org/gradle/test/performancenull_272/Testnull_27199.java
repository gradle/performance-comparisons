package org.gradle.test.performancenull_272;

import static org.junit.Assert.*;

public class Testnull_27199 {
    private final Productionnull_27199 production = new Productionnull_27199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}