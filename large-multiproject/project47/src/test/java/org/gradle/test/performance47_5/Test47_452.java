package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_452 {
    private final Production47_452 production = new Production47_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}