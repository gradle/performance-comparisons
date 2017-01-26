package org.gradle.test.performance99_1;

import static org.junit.Assert.*;

public class Test99_57 {
    private final Production99_57 production = new Production99_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}