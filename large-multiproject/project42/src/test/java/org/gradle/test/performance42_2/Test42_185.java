package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_185 {
    private final Production42_185 production = new Production42_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}