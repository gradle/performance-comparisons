package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_236 {
    private final Production42_236 production = new Production42_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}