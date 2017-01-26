package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_130 {
    private final Production42_130 production = new Production42_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}