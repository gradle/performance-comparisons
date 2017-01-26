package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_31 {
    private final Production47_31 production = new Production47_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}