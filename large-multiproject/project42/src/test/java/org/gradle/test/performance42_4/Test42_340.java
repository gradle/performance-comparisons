package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_340 {
    private final Production42_340 production = new Production42_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}