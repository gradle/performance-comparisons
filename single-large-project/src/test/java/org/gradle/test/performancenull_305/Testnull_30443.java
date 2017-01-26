package org.gradle.test.performancenull_305;

import static org.junit.Assert.*;

public class Testnull_30443 {
    private final Productionnull_30443 production = new Productionnull_30443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}