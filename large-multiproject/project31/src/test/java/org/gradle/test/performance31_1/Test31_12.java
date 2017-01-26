package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_12 {
    private final Production31_12 production = new Production31_12("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}