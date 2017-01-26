package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_141 {
    private final Production42_141 production = new Production42_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}