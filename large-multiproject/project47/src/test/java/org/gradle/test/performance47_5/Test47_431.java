package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_431 {
    private final Production47_431 production = new Production47_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}