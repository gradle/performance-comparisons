package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_36 {
    private final Production31_36 production = new Production31_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}