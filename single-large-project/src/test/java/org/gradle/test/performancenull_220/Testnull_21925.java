package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21925 {
    private final Productionnull_21925 production = new Productionnull_21925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}