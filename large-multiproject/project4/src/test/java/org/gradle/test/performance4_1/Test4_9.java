package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_9 {
    private final Production4_9 production = new Production4_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}