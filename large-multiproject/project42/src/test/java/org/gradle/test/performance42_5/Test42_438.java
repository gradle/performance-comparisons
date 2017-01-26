package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_438 {
    private final Production42_438 production = new Production42_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}