package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_322 {
    private final Production47_322 production = new Production47_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}