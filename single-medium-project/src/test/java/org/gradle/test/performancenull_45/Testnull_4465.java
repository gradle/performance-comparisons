package org.gradle.test.performancenull_45;

import static org.junit.Assert.*;

public class Testnull_4465 {
    private final Productionnull_4465 production = new Productionnull_4465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}