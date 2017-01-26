package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_193 {
    private final Production47_193 production = new Production47_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}