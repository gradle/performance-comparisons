package org.gradle.test.performance14_1;

import static org.junit.Assert.*;

public class Test14_57 {
    private final Production14_57 production = new Production14_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}