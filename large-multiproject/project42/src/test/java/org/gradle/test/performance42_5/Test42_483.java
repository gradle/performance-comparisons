package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_483 {
    private final Production42_483 production = new Production42_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}