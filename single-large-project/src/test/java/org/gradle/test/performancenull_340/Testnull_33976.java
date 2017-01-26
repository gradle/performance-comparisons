package org.gradle.test.performancenull_340;

import static org.junit.Assert.*;

public class Testnull_33976 {
    private final Productionnull_33976 production = new Productionnull_33976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}