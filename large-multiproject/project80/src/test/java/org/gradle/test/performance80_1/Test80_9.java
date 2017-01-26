package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_9 {
    private final Production80_9 production = new Production80_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}