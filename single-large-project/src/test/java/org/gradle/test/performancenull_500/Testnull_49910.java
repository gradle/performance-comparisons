package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49910 {
    private final Productionnull_49910 production = new Productionnull_49910("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}