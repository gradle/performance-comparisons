package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_419 {
    private final Production84_419 production = new Production84_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}