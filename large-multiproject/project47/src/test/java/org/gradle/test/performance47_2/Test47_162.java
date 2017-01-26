package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_162 {
    private final Production47_162 production = new Production47_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}