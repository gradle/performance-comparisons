package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49984 {
    private final Productionnull_49984 production = new Productionnull_49984("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}