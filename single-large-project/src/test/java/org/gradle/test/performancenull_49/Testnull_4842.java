package org.gradle.test.performancenull_49;

import static org.junit.Assert.*;

public class Testnull_4842 {
    private final Productionnull_4842 production = new Productionnull_4842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}