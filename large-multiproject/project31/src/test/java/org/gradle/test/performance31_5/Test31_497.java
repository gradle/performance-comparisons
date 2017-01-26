package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_497 {
    private final Production31_497 production = new Production31_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}