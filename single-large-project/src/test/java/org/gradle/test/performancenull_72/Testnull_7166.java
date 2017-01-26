package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7166 {
    private final Productionnull_7166 production = new Productionnull_7166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}