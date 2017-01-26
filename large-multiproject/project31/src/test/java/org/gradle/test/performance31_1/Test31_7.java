package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_7 {
    private final Production31_7 production = new Production31_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}