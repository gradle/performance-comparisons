package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_469 {
    private final Production42_469 production = new Production42_469("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}