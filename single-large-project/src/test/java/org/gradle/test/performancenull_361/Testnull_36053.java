package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36053 {
    private final Productionnull_36053 production = new Productionnull_36053("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}