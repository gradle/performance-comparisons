package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_413 {
    private final Production42_413 production = new Production42_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}