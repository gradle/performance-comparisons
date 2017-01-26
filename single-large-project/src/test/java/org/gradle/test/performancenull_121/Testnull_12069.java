package org.gradle.test.performancenull_121;

import static org.junit.Assert.*;

public class Testnull_12069 {
    private final Productionnull_12069 production = new Productionnull_12069("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}