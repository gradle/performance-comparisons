package org.gradle.test.performance75_1;

import static org.junit.Assert.*;

public class Test75_9 {
    private final Production75_9 production = new Production75_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}