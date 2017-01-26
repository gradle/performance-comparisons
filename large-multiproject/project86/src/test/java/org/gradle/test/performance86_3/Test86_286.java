package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_286 {
    private final Production86_286 production = new Production86_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}