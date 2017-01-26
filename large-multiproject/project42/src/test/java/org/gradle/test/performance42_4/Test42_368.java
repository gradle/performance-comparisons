package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_368 {
    private final Production42_368 production = new Production42_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}