package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_235 {
    private final Production42_235 production = new Production42_235("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}