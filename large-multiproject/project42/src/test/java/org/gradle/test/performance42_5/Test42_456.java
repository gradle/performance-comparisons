package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_456 {
    private final Production42_456 production = new Production42_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}