package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_443 {
    private final Production14_443 production = new Production14_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}