package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_190 {
    private final Production42_190 production = new Production42_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}