package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_327 {
    private final Production79_327 production = new Production79_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}