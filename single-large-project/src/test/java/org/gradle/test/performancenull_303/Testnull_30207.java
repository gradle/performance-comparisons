package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30207 {
    private final Productionnull_30207 production = new Productionnull_30207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}