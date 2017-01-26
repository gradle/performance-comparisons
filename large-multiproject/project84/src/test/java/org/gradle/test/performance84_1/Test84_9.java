package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_9 {
    private final Production84_9 production = new Production84_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}