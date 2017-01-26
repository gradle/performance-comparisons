package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_343 {
    private final Production47_343 production = new Production47_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}