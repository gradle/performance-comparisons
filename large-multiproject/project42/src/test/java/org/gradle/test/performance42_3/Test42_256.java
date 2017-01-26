package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_256 {
    private final Production42_256 production = new Production42_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}