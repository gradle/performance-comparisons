package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_312 {
    private final Production42_312 production = new Production42_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}