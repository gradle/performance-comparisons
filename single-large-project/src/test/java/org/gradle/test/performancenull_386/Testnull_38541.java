package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38541 {
    private final Productionnull_38541 production = new Productionnull_38541("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}