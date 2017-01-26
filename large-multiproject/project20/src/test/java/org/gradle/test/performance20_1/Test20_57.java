package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_57 {
    private final Production20_57 production = new Production20_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}