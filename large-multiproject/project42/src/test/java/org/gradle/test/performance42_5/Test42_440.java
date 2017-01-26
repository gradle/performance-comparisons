package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_440 {
    private final Production42_440 production = new Production42_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}