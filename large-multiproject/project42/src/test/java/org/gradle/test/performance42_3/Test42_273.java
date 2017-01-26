package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_273 {
    private final Production42_273 production = new Production42_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}