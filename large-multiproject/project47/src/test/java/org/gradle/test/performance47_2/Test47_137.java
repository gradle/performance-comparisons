package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_137 {
    private final Production47_137 production = new Production47_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}