package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_478 {
    private final Production14_478 production = new Production14_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}