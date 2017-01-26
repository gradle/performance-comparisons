package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_1 {
    private final Production31_1 production = new Production31_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}