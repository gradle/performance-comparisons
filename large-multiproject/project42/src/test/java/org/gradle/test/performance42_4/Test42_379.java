package org.gradle.test.performance42_4;

import static org.junit.Assert.*;

public class Test42_379 {
    private final Production42_379 production = new Production42_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}