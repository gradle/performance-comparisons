package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_237 {
    private final Production20_237 production = new Production20_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}