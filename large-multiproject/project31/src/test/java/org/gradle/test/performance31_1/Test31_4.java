package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_4 {
    private final Production31_4 production = new Production31_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}