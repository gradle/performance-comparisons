package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25207 {
    private final Productionnull_25207 production = new Productionnull_25207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}