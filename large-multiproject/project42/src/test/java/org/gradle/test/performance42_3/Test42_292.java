package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_292 {
    private final Production42_292 production = new Production42_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}