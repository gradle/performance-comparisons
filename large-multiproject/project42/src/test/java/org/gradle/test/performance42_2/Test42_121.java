package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_121 {
    private final Production42_121 production = new Production42_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}