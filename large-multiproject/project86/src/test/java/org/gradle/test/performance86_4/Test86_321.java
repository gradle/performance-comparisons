package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_321 {
    private final Production86_321 production = new Production86_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}