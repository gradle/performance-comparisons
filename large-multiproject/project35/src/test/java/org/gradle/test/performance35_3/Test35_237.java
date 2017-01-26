package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_237 {
    private final Production35_237 production = new Production35_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}