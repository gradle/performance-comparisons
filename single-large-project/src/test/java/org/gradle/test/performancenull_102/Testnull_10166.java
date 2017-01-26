package org.gradle.test.performancenull_102;

import static org.junit.Assert.*;

public class Testnull_10166 {
    private final Productionnull_10166 production = new Productionnull_10166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}