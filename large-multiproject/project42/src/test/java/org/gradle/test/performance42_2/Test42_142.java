package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_142 {
    private final Production42_142 production = new Production42_142("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}