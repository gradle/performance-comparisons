package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_109 {
    private final Production80_109 production = new Production80_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}