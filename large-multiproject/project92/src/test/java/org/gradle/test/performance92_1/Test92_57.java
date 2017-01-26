package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_57 {
    private final Production92_57 production = new Production92_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}