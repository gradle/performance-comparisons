package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_61 {
    private final Production31_61 production = new Production31_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}