package org.gradle.test.performance14_4;

import static org.junit.Assert.*;

public class Test14_368 {
    private final Production14_368 production = new Production14_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}