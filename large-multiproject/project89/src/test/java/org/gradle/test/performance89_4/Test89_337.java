package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_337 {
    private final Production89_337 production = new Production89_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}