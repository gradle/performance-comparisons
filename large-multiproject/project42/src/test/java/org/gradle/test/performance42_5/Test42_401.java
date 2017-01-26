package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_401 {
    private final Production42_401 production = new Production42_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}