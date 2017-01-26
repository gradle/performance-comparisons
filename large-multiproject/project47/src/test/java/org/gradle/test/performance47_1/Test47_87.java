package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_87 {
    private final Production47_87 production = new Production47_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}