package org.gradle.test.performancenull_481;

import static org.junit.Assert.*;

public class Testnull_48086 {
    private final Productionnull_48086 production = new Productionnull_48086("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}