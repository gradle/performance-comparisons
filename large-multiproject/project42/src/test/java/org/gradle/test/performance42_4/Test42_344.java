package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_344 {
    private final Production42_344 production = new Production42_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}