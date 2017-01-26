package org.gradle.test.performance43_1;

import static org.junit.Assert.*;

public class Test43_57 {
    private final Production43_57 production = new Production43_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}