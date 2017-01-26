package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_215 {
    private final Production47_215 production = new Production47_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}