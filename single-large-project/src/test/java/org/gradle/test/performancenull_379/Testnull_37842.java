package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37842 {
    private final Productionnull_37842 production = new Productionnull_37842("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}