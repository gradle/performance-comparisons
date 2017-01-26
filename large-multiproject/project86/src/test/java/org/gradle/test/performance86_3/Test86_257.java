package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_257 {
    private final Production86_257 production = new Production86_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}