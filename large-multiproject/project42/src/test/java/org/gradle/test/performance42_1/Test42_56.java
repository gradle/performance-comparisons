package org.gradle.test.performance42_1;

import static org.junit.Assert.*;

public class Test42_56 {
    private final Production42_56 production = new Production42_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}