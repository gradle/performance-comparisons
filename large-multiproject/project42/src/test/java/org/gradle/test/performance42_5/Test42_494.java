package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_494 {
    private final Production42_494 production = new Production42_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}