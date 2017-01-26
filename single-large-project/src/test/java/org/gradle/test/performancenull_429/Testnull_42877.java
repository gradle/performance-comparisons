package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42877 {
    private final Productionnull_42877 production = new Productionnull_42877("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}