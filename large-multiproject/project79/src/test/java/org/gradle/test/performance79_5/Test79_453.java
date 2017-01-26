package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_453 {
    private final Production79_453 production = new Production79_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}