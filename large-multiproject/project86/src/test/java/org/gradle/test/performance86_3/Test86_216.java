package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_216 {
    private final Production86_216 production = new Production86_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}