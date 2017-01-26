package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38579 {
    private final Productionnull_38579 production = new Productionnull_38579("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}