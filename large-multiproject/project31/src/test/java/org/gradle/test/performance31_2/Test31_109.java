package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_109 {
    private final Production31_109 production = new Production31_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}