package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_489 {
    private final Production42_489 production = new Production42_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}