package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_455 {
    private final Production42_455 production = new Production42_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}