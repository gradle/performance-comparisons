package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_308 {
    private final Production42_308 production = new Production42_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}