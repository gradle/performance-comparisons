package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_131 {
    private final Production47_131 production = new Production47_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}