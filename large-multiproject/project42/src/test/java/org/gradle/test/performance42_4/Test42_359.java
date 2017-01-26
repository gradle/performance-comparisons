package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_359 {
    private final Production42_359 production = new Production42_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}