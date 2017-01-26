package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42875 {
    private final Productionnull_42875 production = new Productionnull_42875("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}