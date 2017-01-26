package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_299 {
    private final Production79_299 production = new Production79_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}