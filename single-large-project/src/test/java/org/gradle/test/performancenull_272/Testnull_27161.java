package org.gradle.test.performancenull_272;

import static org.junit.Assert.*;

public class Testnull_27161 {
    private final Productionnull_27161 production = new Productionnull_27161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}