package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_57 {
    private final Production7_57 production = new Production7_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}