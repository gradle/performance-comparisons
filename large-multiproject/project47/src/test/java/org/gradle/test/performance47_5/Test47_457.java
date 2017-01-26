package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_457 {
    private final Production47_457 production = new Production47_457("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}