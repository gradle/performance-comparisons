package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_223 {
    private final Production79_223 production = new Production79_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}