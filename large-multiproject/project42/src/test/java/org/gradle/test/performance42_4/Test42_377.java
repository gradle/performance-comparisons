package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_377 {
    private final Production42_377 production = new Production42_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}