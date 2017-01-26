package org.gradle.test.performancenull_188;

import static org.junit.Assert.*;

public class Testnull_18709 {
    private final Productionnull_18709 production = new Productionnull_18709("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}