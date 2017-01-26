package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_440 {
    private final Production47_440 production = new Production47_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}