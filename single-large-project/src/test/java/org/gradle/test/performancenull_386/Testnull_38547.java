package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38547 {
    private final Productionnull_38547 production = new Productionnull_38547("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}