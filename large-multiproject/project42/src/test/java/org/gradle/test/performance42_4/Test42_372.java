package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_372 {
    private final Production42_372 production = new Production42_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}