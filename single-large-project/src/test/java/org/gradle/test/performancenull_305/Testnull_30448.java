package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30448 {
    private final Productionnull_30448 production = new Productionnull_30448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}