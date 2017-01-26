package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_15 {
    private final Production47_15 production = new Production47_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}