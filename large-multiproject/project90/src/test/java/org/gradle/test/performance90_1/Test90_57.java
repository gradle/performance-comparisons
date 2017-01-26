package org.gradle.test.performance90_1;

import static org.junit.Assert.*;

public class Test90_57 {
    private final Production90_57 production = new Production90_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}