package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_384 {
    private final Production42_384 production = new Production42_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}