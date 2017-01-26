package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_245 {
    private final Production79_245 production = new Production79_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}