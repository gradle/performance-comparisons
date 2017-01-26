package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_387 {
    private final Production86_387 production = new Production86_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}