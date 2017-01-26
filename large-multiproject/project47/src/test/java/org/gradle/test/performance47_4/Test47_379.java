package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_379 {
    private final Production47_379 production = new Production47_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}