package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_408 {
    private final Production79_408 production = new Production79_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}