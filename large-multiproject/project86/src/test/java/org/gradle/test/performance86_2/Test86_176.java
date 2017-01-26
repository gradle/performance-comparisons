package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_176 {
    private final Production86_176 production = new Production86_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}