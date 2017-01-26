package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_243 {
    private final Production47_243 production = new Production47_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}