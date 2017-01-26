package org.gradle.test.performancenull_429;

import static org.junit.Assert.*;

public class Testnull_42809 {
    private final Productionnull_42809 production = new Productionnull_42809("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}