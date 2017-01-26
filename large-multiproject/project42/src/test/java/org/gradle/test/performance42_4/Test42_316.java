package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_316 {
    private final Production42_316 production = new Production42_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}