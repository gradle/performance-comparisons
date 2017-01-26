package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_276 {
    private final Production42_276 production = new Production42_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}