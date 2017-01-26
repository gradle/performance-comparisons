package org.gradle.test.performancenull_361;

import static org.junit.Assert.*;

public class Testnull_36072 {
    private final Productionnull_36072 production = new Productionnull_36072("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}