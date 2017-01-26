package org.gradle.test.performance63_3;

import static org.junit.Assert.*;

public class Test63_237 {
    private final Production63_237 production = new Production63_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}