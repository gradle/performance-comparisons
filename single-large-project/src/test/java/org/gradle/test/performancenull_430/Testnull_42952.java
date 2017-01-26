package org.gradle.test.performancenull_430;

import static org.junit.Assert.*;

public class Testnull_42952 {
    private final Productionnull_42952 production = new Productionnull_42952("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}