package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38536 {
    private final Productionnull_38536 production = new Productionnull_38536("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}