package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_396 {
    private final Production47_396 production = new Production47_396("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}