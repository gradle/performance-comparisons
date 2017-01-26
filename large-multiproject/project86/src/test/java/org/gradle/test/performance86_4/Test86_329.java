package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_329 {
    private final Production86_329 production = new Production86_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}