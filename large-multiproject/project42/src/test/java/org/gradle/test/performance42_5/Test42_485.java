package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_485 {
    private final Production42_485 production = new Production42_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}