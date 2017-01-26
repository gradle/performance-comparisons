package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_459 {
    private final Production14_459 production = new Production14_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}