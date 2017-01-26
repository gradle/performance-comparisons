package org.gradle.test.performancenull_412;

import static org.junit.Assert.*;

public class Testnull_41190 {
    private final Productionnull_41190 production = new Productionnull_41190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}