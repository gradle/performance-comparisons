package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_283 {
    private final Production42_283 production = new Production42_283("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}