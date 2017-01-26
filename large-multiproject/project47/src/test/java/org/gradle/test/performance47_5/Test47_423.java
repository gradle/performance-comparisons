package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_423 {
    private final Production47_423 production = new Production47_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}