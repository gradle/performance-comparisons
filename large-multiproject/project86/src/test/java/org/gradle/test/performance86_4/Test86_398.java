package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_398 {
    private final Production86_398 production = new Production86_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}