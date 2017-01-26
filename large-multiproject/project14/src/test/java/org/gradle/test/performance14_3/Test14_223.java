package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_223 {
    private final Production14_223 production = new Production14_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}