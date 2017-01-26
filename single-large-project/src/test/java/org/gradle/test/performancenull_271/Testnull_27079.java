package org.gradle.test.performancenull_271;

import static org.junit.Assert.*;

public class Testnull_27079 {
    private final Productionnull_27079 production = new Productionnull_27079("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}