package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_470 {
    private final Production86_470 production = new Production86_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}