package org.gradle.test.performancenull_309;

import static org.junit.Assert.*;

public class Testnull_30846 {
    private final Productionnull_30846 production = new Productionnull_30846("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}