package org.gradle.test.performancenull_215;

import static org.junit.Assert.*;

public class Testnull_21497 {
    private final Productionnull_21497 production = new Productionnull_21497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}