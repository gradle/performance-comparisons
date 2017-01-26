package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_375 {
    private final Production14_375 production = new Production14_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}