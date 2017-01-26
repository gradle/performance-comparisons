package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_438 {
    private final Production86_438 production = new Production86_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}