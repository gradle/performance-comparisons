package org.gradle.test.performancenull_302;

import static org.junit.Assert.*;

public class Testnull_30138 {
    private final Productionnull_30138 production = new Productionnull_30138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}