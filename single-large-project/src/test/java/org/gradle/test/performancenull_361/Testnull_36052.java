package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36052 {
    private final Productionnull_36052 production = new Productionnull_36052("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}