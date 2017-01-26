package org.gradle.test.performancenull_350;

import static org.junit.Assert.*;

public class Testnull_34925 {
    private final Productionnull_34925 production = new Productionnull_34925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}