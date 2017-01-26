package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_145 {
    private final Production47_145 production = new Production47_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}