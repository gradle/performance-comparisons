package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_489 {
    private final Production14_489 production = new Production14_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}