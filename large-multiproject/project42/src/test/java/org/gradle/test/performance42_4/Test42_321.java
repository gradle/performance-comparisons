package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_321 {
    private final Production42_321 production = new Production42_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}