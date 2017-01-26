package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_57 {
    private final Production42_57 production = new Production42_57("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}