package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_429 {
    private final Production79_429 production = new Production79_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}