package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_337 {
    private final Production4_337 production = new Production4_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}