package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_316 {
    private final Production14_316 production = new Production14_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}