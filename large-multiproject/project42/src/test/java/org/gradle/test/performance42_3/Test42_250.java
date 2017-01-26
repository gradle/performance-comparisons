package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_250 {
    private final Production42_250 production = new Production42_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}