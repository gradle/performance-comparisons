package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_237 {
    private final Production7_237 production = new Production7_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}