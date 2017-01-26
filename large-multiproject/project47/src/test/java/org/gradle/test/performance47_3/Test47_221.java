package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_221 {
    private final Production47_221 production = new Production47_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}