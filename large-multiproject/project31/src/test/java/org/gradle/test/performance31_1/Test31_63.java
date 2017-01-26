package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_63 {
    private final Production31_63 production = new Production31_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}