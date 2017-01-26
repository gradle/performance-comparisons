package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21955 {
    private final Productionnull_21955 production = new Productionnull_21955("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}