package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_385 {
    private final Production79_385 production = new Production79_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}