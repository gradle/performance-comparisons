package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_253 {
    private final Production86_253 production = new Production86_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}