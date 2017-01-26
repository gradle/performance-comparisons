package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_349 {
    private final Production42_349 production = new Production42_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}