package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_473 {
    private final Production42_473 production = new Production42_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}