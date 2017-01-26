package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_123 {
    private final Production19_123 production = new Production19_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}