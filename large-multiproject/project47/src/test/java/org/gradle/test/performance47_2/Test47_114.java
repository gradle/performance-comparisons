package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_114 {
    private final Production47_114 production = new Production47_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}