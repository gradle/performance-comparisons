package org.gradle.test.performancenull_422;

import static org.junit.Assert.*;

public class Testnull_42166 {
    private final Productionnull_42166 production = new Productionnull_42166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}