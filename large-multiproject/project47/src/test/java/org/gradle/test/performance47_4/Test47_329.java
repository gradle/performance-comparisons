package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_329 {
    private final Production47_329 production = new Production47_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}