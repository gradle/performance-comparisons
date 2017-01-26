package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_309 {
    private final Production47_309 production = new Production47_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}