package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_170 {
    private final Production86_170 production = new Production86_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}