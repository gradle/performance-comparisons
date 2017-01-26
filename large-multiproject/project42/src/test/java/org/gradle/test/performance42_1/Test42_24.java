package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_24 {
    private final Production42_24 production = new Production42_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}