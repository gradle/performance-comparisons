package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18190 {
    private final Productionnull_18190 production = new Productionnull_18190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}