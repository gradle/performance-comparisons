package org.gradle.test.performancenull_484;

import static org.junit.Assert.*;

public class Testnull_48327 {
    private final Productionnull_48327 production = new Productionnull_48327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}