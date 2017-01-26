package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_57 {
    private final Production77_57 production = new Production77_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}