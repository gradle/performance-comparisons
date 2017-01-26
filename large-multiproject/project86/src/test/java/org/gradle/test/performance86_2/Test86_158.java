package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_158 {
    private final Production86_158 production = new Production86_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}