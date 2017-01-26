package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_262 {
    private final Production79_262 production = new Production79_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}