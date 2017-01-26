package org.gradle.test.performancenull_27;

import static org.junit.Assert.*;

public class Testnull_2601 {
    private final Productionnull_2601 production = new Productionnull_2601("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}