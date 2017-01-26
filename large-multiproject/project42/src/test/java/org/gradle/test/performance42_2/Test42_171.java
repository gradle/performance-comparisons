package org.gradle.test.performance42_2;

import static org.junit.Assert.*;

public class Test42_171 {
    private final Production42_171 production = new Production42_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}