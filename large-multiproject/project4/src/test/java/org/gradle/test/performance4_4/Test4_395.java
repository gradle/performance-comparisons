package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_395 {
    private final Production4_395 production = new Production4_395("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}