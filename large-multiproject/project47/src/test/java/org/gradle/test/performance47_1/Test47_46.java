package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_46 {
    private final Production47_46 production = new Production47_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}