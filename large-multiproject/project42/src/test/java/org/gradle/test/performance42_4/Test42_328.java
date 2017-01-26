package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_328 {
    private final Production42_328 production = new Production42_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}