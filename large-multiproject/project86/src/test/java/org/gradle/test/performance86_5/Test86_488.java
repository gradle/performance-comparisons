package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_488 {
    private final Production86_488 production = new Production86_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}