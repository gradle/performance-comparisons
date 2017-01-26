package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_217 {
    private final Production42_217 production = new Production42_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}