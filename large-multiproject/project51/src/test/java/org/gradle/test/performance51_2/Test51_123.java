package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_123 {
    private final Production51_123 production = new Production51_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}