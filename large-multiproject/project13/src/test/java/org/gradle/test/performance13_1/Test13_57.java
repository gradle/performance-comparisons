package org.gradle.test.performance13_1;

import static org.junit.Assert.*;

public class Test13_57 {
    private final Production13_57 production = new Production13_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}