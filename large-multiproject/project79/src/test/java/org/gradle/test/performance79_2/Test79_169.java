package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_169 {
    private final Production79_169 production = new Production79_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}