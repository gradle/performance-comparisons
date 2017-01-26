package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_348 {
    private final Production14_348 production = new Production14_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}