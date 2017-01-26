package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_318 {
    private final Production42_318 production = new Production42_318("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}