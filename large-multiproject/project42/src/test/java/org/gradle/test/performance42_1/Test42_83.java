package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_83 {
    private final Production42_83 production = new Production42_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}