package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_37 {
    private final Production47_37 production = new Production47_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}