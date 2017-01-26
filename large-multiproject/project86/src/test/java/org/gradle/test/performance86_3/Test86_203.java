package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_203 {
    private final Production86_203 production = new Production86_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}