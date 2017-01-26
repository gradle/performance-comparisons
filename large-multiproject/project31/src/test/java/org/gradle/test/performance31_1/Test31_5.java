package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_5 {
    private final Production31_5 production = new Production31_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}