package org.gradle.test.performancenull_359;

import static org.junit.Assert.*;

public class Testnull_35845 {
    private final Productionnull_35845 production = new Productionnull_35845("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}