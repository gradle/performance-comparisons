package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_401 {
    private final Production86_401 production = new Production86_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}