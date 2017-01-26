package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_328 {
    private final Production89_328 production = new Production89_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}