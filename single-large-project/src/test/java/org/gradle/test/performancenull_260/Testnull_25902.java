package org.gradle.test.performancenull_260;

import static org.junit.Assert.*;

public class Testnull_25902 {
    private final Productionnull_25902 production = new Productionnull_25902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}