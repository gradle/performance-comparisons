package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_149 {
    private final Production42_149 production = new Production42_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}