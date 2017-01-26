package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_466 {
    private final Production31_466 production = new Production31_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}