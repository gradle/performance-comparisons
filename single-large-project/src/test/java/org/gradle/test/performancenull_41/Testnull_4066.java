package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4066 {
    private final Productionnull_4066 production = new Productionnull_4066("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}