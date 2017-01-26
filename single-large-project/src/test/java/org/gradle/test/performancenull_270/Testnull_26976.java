package org.gradle.test.performancenull_270;

import static org.junit.Assert.*;

public class Testnull_26976 {
    private final Productionnull_26976 production = new Productionnull_26976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}