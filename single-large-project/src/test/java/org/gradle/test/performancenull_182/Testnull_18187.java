package org.gradle.test.performancenull_182;

import static org.junit.Assert.*;

public class Testnull_18187 {
    private final Productionnull_18187 production = new Productionnull_18187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}