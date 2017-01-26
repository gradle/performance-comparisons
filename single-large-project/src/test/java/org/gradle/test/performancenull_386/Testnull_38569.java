package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38569 {
    private final Productionnull_38569 production = new Productionnull_38569("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}