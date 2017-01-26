package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_103 {
    private final Production42_103 production = new Production42_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}