package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42925 {
    private final Productionnull_42925 production = new Productionnull_42925("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}