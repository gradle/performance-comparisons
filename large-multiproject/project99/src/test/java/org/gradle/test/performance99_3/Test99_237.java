package org.gradle.test.performance99_3;

import static org.junit.Assert.*;

public class Test99_237 {
    private final Production99_237 production = new Production99_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}