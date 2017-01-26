package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_64 {
    private final Production86_64 production = new Production86_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}