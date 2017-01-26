package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_79 {
    private final Production42_79 production = new Production42_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}