package org.gradle.test.performance47_2;

import static org.junit.Assert.*;

public class Test47_187 {
    private final Production47_187 production = new Production47_187("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}