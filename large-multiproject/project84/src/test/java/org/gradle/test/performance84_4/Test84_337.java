package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_337 {
    private final Production84_337 production = new Production84_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}