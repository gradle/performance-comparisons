package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_87 {
    private final Production31_87 production = new Production31_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}