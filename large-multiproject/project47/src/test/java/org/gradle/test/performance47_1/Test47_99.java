package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_99 {
    private final Production47_99 production = new Production47_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}