package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_192 {
    private final Production86_192 production = new Production86_192("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}