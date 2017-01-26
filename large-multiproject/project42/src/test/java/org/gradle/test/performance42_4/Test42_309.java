package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_309 {
    private final Production42_309 production = new Production42_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}