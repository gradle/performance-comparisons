package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_376 {
    private final Production42_376 production = new Production42_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}