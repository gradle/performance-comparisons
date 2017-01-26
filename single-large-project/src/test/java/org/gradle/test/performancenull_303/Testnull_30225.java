package org.gradle.test.performancenull_303;

import static org.junit.Assert.*;

public class Testnull_30225 {
    private final Productionnull_30225 production = new Productionnull_30225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}