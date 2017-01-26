package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_188 {
    private final Production86_188 production = new Production86_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}