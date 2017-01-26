package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_46 {
    private final Production31_46 production = new Production31_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}