package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10149 {
    private final Productionnull_10149 production = new Productionnull_10149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}