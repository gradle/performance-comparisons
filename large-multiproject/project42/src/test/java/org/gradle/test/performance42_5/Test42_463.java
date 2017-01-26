package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_463 {
    private final Production42_463 production = new Production42_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}