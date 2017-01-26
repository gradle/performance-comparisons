package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_224 {
    private final Production42_224 production = new Production42_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}