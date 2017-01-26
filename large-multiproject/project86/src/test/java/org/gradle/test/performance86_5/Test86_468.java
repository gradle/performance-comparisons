package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_468 {
    private final Production86_468 production = new Production86_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}