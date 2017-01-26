package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27003 {
    private final Productionnull_27003 production = new Productionnull_27003("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}