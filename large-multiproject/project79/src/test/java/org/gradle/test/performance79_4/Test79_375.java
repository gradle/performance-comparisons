package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_375 {
    private final Production79_375 production = new Production79_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}