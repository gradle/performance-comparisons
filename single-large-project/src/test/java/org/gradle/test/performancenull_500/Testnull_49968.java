package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49968 {
    private final Productionnull_49968 production = new Productionnull_49968("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}