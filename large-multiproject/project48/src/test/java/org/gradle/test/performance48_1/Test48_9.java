package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_9 {
    private final Production48_9 production = new Production48_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}