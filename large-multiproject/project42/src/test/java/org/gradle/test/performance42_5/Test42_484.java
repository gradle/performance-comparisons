package org.gradle.test.performance42_5;

import static org.junit.Assert.*;

public class Test42_484 {
    private final Production42_484 production = new Production42_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}