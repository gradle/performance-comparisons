package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_11 {
    private final Production42_11 production = new Production42_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}