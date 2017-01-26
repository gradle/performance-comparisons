package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_443 {
    private final Production42_443 production = new Production42_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}