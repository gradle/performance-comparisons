package org.gradle.test.performancenull_386;

import static org.junit.Assert.*;

public class Testnull_38531 {
    private final Productionnull_38531 production = new Productionnull_38531("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}