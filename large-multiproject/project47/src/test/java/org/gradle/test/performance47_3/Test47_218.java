package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_218 {
    private final Production47_218 production = new Production47_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}