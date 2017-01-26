package org.gradle.test.performance47_4;

import static org.junit.Assert.*;

public class Test47_306 {
    private final Production47_306 production = new Production47_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}