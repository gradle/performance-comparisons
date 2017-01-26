package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_242 {
    private final Production42_242 production = new Production42_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}