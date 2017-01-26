package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_459 {
    private final Production42_459 production = new Production42_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}