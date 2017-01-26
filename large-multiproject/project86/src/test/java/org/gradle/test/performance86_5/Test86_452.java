package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_452 {
    private final Production86_452 production = new Production86_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}