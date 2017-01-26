package org.gradle.test.performancenull_200;

import static org.junit.Assert.*;

public class Testnull_19902 {
    private final Productionnull_19902 production = new Productionnull_19902("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}