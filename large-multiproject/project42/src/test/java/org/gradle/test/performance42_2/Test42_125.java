package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_125 {
    private final Production42_125 production = new Production42_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}