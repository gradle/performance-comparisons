package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_201 {
    private final Production42_201 production = new Production42_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}