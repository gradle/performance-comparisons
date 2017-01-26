package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_339 {
    private final Production42_339 production = new Production42_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}