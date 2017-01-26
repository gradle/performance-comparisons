package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_223 {
    private final Production42_223 production = new Production42_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}