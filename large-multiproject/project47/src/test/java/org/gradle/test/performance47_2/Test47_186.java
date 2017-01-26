package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_186 {
    private final Production47_186 production = new Production47_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}