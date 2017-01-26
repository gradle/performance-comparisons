package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_48 {
    private final Production31_48 production = new Production31_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}