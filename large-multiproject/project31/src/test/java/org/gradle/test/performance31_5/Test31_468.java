package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_468 {
    private final Production31_468 production = new Production31_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}