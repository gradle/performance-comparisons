package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_216 {
    private final Production42_216 production = new Production42_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}