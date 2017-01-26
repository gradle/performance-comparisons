package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_221 {
    private final Production42_221 production = new Production42_221("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}