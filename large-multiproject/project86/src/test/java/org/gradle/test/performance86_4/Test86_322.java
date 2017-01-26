package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_322 {
    private final Production86_322 production = new Production86_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}