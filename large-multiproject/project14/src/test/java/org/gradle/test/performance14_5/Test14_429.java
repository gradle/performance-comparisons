package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_429 {
    private final Production14_429 production = new Production14_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}