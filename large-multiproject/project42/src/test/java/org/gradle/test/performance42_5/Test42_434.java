package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_434 {
    private final Production42_434 production = new Production42_434("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}