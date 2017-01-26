package org.gradle.test.performancenull_41;

import static org.junit.Assert.*;

public class Testnull_4088 {
    private final Productionnull_4088 production = new Productionnull_4088("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}