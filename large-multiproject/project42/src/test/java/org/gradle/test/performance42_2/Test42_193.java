package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_193 {
    private final Production42_193 production = new Production42_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}