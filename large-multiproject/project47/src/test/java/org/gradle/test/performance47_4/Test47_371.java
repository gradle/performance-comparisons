package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_371 {
    private final Production47_371 production = new Production47_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}