package org.gradle.test.performancenull_155;

import static org.junit.Assert.*;

public class Testnull_15426 {
    private final Productionnull_15426 production = new Productionnull_15426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}