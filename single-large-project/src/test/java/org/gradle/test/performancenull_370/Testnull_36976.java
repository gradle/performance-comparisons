package org.gradle.test.performancenull_370;

import static org.junit.Assert.*;

public class Testnull_36976 {
    private final Productionnull_36976 production = new Productionnull_36976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}