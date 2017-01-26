package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_470 {
    private final Production42_470 production = new Production42_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}