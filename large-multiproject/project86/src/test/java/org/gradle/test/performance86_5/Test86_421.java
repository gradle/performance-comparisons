package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_421 {
    private final Production86_421 production = new Production86_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}