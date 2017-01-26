package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_283 {
    private final Production47_283 production = new Production47_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}