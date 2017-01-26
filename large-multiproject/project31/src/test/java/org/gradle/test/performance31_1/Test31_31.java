package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_31 {
    private final Production31_31 production = new Production31_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}