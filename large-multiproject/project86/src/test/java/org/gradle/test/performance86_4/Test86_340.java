package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_340 {
    private final Production86_340 production = new Production86_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}