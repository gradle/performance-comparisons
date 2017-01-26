package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_205 {
    private final Production86_205 production = new Production86_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}