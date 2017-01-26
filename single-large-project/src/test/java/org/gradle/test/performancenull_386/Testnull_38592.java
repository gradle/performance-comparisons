package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38592 {
    private final Productionnull_38592 production = new Productionnull_38592("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}