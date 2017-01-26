package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_115 {
    private final Production42_115 production = new Production42_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}