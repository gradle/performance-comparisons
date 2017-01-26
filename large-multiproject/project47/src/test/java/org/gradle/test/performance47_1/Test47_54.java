package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_54 {
    private final Production47_54 production = new Production47_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}