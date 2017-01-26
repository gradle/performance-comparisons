package org.gradle.test.performancenull_40;

import static org.junit.Assert.*;

public class Testnull_3976 {
    private final Productionnull_3976 production = new Productionnull_3976("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}