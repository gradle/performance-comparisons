package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_127 {
    private final Production47_127 production = new Production47_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}