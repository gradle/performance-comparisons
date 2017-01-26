package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_164 {
    private final Production86_164 production = new Production86_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}