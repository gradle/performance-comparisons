package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_203 {
    private final Production42_203 production = new Production42_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}