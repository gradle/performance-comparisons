package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_317 {
    private final Production42_317 production = new Production42_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}