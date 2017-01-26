package org.gradle.test.performancenull_450;

import static org.junit.Assert.*;

public class Testnull_44981 {
    private final Productionnull_44981 production = new Productionnull_44981("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}