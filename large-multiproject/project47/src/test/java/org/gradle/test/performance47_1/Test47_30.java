package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_30 {
    private final Production47_30 production = new Production47_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}