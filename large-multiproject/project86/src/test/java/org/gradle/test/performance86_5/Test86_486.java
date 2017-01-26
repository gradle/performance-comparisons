package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_486 {
    private final Production86_486 production = new Production86_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}