package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_402 {
    private final Production42_402 production = new Production42_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}