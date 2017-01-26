package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_464 {
    private final Production4_464 production = new Production4_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}