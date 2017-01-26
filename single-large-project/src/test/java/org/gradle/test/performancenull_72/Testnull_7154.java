package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7154 {
    private final Productionnull_7154 production = new Productionnull_7154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}