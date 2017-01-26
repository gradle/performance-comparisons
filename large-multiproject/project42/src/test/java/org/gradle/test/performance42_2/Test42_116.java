package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_116 {
    private final Production42_116 production = new Production42_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}