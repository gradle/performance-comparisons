package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_299 {
    private final Production42_299 production = new Production42_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}