package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_240 {
    private final Production42_240 production = new Production42_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}