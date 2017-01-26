package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42894 {
    private final Productionnull_42894 production = new Productionnull_42894("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}