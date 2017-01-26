package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_232 {
    private final Production42_232 production = new Production42_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}