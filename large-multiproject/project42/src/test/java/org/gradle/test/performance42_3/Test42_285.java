package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_285 {
    private final Production42_285 production = new Production42_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}