package org.gradle.test.performancenull_162;

import static org.junit.Assert.*;

public class Testnull_16190 {
    private final Productionnull_16190 production = new Productionnull_16190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}