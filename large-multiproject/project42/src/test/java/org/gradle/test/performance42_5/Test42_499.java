package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_499 {
    private final Production42_499 production = new Production42_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}