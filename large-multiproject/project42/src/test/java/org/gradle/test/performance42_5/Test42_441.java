package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_441 {
    private final Production42_441 production = new Production42_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}