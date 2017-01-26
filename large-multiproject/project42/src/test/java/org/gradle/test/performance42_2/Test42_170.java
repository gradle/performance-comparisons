package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_170 {
    private final Production42_170 production = new Production42_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}