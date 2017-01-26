package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_409 {
    private final Production42_409 production = new Production42_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}