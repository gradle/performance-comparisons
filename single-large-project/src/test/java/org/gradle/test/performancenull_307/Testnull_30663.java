package org.gradle.test.performancenull_307;

import static org.junit.Assert.*;

public class Testnull_30663 {
    private final Productionnull_30663 production = new Productionnull_30663("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}