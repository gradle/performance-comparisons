package org.gradle.test.performance86_2;

import static org.junit.Assert.*;

public class Test86_171 {
    private final Production86_171 production = new Production86_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}