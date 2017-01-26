package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_57 {
    private final Production10_57 production = new Production10_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}