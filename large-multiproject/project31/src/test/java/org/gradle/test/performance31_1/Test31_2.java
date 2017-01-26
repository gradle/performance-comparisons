package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_2 {
    private final Production31_2 production = new Production31_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}