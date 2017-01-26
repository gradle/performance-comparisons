package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_391 {
    private final Production42_391 production = new Production42_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}