package org.gradle.test.performancenull_219;

import static org.junit.Assert.*;

public class Testnull_21863 {
    private final Productionnull_21863 production = new Productionnull_21863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}