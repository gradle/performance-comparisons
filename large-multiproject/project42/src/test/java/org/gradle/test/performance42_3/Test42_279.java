package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_279 {
    private final Production42_279 production = new Production42_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}