package org.gradle.test.performance42_3;

import static org.junit.Assert.*;

public class Test42_261 {
    private final Production42_261 production = new Production42_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}