package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_453 {
    private final Production14_453 production = new Production14_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}