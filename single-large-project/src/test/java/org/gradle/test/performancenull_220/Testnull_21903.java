package org.gradle.test.performancenull_220;

import static org.junit.Assert.*;

public class Testnull_21903 {
    private final Productionnull_21903 production = new Productionnull_21903("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}