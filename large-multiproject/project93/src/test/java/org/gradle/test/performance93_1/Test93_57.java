package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_57 {
    private final Production93_57 production = new Production93_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}