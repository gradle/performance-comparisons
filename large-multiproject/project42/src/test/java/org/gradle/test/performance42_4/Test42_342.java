package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_342 {
    private final Production42_342 production = new Production42_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}