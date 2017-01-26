package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_9 {
    private final Production13_9 production = new Production13_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}