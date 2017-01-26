package org.gradle.test.performancenull_202;

import static org.junit.Assert.*;

public class Testnull_20172 {
    private final Productionnull_20172 production = new Productionnull_20172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}