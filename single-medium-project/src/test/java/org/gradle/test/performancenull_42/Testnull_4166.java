package org.gradle.test.performancenull_42;

import static org.junit.Assert.*;

public class Testnull_4166 {
    private final Productionnull_4166 production = new Productionnull_4166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}