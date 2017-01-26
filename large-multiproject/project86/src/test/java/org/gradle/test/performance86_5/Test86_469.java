package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_469 {
    private final Production86_469 production = new Production86_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}