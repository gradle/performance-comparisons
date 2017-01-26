package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_410 {
    private final Production42_410 production = new Production42_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}