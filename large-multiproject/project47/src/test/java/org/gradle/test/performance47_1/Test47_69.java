package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_69 {
    private final Production47_69 production = new Production47_69("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}