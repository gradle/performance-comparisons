package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_477 {
    private final Production4_477 production = new Production4_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}