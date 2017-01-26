package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_198 {
    private final Production42_198 production = new Production42_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}