package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_343 {
    private final Production86_343 production = new Production86_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}