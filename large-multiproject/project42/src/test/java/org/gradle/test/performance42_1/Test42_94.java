package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_94 {
    private final Production42_94 production = new Production42_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}