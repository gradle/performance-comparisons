package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_479 {
    private final Production86_479 production = new Production86_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}