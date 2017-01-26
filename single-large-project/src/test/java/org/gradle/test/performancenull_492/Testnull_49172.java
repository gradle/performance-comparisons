package org.gradle.test.performancenull_492;

import static org.junit.Assert.*;

public class Testnull_49172 {
    private final Productionnull_49172 production = new Productionnull_49172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}