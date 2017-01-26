package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_188 {
    private final Production47_188 production = new Production47_188("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}