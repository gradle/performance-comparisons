package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_432 {
    private final Production84_432 production = new Production84_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}