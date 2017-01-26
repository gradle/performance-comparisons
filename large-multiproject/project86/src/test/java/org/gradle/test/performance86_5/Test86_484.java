package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_484 {
    private final Production86_484 production = new Production86_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}