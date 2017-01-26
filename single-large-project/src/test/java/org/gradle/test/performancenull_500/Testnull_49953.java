package org.gradle.test.performancenull_500;

import static org.junit.Assert.*;

public class Testnull_49953 {
    private final Productionnull_49953 production = new Productionnull_49953("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}