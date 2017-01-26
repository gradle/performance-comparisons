package org.gradle.test.performancenull_192;

import static org.junit.Assert.*;

public class Testnull_19183 {
    private final Productionnull_19183 production = new Productionnull_19183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}