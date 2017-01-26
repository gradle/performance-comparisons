package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_123 {
    private final Production64_123 production = new Production64_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}