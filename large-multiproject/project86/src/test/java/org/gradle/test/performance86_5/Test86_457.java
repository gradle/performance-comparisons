package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_457 {
    private final Production86_457 production = new Production86_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}