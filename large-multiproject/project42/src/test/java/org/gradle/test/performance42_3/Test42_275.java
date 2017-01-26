package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_275 {
    private final Production42_275 production = new Production42_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}