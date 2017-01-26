package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38530 {
    private final Productionnull_38530 production = new Productionnull_38530("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}