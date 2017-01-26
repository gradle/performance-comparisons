package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38521 {
    private final Productionnull_38521 production = new Productionnull_38521("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}