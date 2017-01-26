package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_442 {
    private final Production31_442 production = new Production31_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}