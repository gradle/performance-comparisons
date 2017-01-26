package org.gradle.test.performance86_3;

import static org.junit.Assert.*;

public class Test86_247 {
    private final Production86_247 production = new Production86_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}