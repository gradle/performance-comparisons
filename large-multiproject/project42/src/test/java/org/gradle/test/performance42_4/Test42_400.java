package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_400 {
    private final Production42_400 production = new Production42_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}