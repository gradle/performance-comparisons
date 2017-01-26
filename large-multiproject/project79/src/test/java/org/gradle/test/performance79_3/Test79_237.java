package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_237 {
    private final Production79_237 production = new Production79_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}