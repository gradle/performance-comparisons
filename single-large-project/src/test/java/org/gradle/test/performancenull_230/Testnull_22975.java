package org.gradle.test.performancenull_230;

import static org.junit.Assert.*;

public class Testnull_22975 {
    private final Productionnull_22975 production = new Productionnull_22975("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}