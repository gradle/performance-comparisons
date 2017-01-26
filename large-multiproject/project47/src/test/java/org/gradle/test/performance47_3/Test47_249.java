package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_249 {
    private final Production47_249 production = new Production47_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}