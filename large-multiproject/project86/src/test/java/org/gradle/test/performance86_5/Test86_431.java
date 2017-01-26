package org.gradle.test.performance86_5;

import static org.junit.Assert.*;

public class Test86_431 {
    private final Production86_431 production = new Production86_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}