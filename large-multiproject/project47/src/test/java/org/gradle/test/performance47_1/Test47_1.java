package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_1 {
    private final Production47_1 production = new Production47_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}