package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_491 {
    private final Production42_491 production = new Production42_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}