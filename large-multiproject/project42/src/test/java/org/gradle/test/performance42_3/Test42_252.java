package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_252 {
    private final Production42_252 production = new Production42_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}