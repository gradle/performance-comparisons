package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_129 {
    private final Production42_129 production = new Production42_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}