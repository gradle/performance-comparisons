package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_55 {
    private final Production31_55 production = new Production31_55("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}