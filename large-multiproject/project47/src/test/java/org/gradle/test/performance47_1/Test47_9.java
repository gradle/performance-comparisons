package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_9 {
    private final Production47_9 production = new Production47_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}