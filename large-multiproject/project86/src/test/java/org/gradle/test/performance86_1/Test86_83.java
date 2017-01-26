package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_83 {
    private final Production86_83 production = new Production86_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}