package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_467 {
    private final Production42_467 production = new Production42_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}