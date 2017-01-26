package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_57 {
    private final Production5_57 production = new Production5_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}