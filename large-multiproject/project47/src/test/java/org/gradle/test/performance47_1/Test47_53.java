package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_53 {
    private final Production47_53 production = new Production47_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}