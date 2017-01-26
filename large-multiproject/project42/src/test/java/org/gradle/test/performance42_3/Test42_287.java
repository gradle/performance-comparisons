package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_287 {
    private final Production42_287 production = new Production42_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}