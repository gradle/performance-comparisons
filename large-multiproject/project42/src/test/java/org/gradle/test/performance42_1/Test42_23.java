package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_23 {
    private final Production42_23 production = new Production42_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}