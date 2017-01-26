package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_399 {
    private final Production79_399 production = new Production79_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}