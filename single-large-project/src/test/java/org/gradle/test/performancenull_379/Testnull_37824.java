package org.gradle.test.performancenull_379;

import static org.junit.Assert.*;

public class Testnull_37824 {
    private final Productionnull_37824 production = new Productionnull_37824("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}