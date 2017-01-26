package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_22 {
    private final Production42_22 production = new Production42_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}