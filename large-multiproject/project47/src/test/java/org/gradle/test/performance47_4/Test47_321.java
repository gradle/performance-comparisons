package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_321 {
    private final Production47_321 production = new Production47_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}