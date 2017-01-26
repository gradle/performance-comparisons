package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42863 {
    private final Productionnull_42863 production = new Productionnull_42863("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}