package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_243 {
    private final Production86_243 production = new Production86_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}