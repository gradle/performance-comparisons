package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_237 {
    private final Production90_237 production = new Production90_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}