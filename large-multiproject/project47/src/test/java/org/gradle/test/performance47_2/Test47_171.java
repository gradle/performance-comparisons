package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_171 {
    private final Production47_171 production = new Production47_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}