package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_464 {
    private final Production31_464 production = new Production31_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}