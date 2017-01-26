package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_158 {
    private final Production42_158 production = new Production42_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}