package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_32 {
    private final Production42_32 production = new Production42_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}