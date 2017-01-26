package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_13 {
    private final Production42_13 production = new Production42_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}