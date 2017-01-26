package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_420 {
    private final Production42_420 production = new Production42_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}