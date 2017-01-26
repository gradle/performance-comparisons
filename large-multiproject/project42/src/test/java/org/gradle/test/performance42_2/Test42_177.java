package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_177 {
    private final Production42_177 production = new Production42_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}