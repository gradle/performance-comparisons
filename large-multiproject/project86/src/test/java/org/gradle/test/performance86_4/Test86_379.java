package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_379 {
    private final Production86_379 production = new Production86_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}