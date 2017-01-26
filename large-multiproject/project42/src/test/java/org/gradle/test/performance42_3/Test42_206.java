package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_206 {
    private final Production42_206 production = new Production42_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}