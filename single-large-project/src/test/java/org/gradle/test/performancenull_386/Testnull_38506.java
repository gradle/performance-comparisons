package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38506 {
    private final Productionnull_38506 production = new Productionnull_38506("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}