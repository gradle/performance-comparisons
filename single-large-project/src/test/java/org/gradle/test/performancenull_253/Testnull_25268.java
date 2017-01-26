package org.gradle.test.performancenull_253;

import static org.junit.Assert.*;

public class Testnull_25268 {
    private final Productionnull_25268 production = new Productionnull_25268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}