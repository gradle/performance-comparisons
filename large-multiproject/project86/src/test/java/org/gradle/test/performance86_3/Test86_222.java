package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_222 {
    private final Production86_222 production = new Production86_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}