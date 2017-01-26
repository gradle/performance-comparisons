package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_190 {
    private final Production86_190 production = new Production86_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}