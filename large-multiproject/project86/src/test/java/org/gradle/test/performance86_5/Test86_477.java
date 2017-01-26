package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_477 {
    private final Production86_477 production = new Production86_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}