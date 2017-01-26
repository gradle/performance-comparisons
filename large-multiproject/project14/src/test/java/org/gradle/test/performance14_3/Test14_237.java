package org.gradle.test.performance14_3;

import static org.junit.Assert.*;

public class Test14_237 {
    private final Production14_237 production = new Production14_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}