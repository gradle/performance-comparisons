package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27042 {
    private final Productionnull_27042 production = new Productionnull_27042("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}