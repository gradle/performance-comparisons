package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_52 {
    private final Production86_52 production = new Production86_52("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}