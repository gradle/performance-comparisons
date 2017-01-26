package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_208 {
    private final Production86_208 production = new Production86_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}