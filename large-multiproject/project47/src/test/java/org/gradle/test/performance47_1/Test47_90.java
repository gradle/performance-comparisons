package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_90 {
    private final Production47_90 production = new Production47_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}