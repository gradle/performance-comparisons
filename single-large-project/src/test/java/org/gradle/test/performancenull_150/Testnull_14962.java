package org.gradle.test.performancenull_150;

import static org.junit.Assert.*;

public class Testnull_14962 {
    private final Productionnull_14962 production = new Productionnull_14962("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}