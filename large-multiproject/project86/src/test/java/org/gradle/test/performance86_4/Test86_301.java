package org.gradle.test.performance86_4;

import static org.junit.Assert.*;

public class Test86_301 {
    private final Production86_301 production = new Production86_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}