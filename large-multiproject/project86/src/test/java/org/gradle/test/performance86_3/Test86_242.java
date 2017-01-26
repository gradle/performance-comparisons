package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_242 {
    private final Production86_242 production = new Production86_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}