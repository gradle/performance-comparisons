package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_169 {
    private final Production14_169 production = new Production14_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}