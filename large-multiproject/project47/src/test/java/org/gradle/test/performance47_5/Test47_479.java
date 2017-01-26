package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_479 {
    private final Production47_479 production = new Production47_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}