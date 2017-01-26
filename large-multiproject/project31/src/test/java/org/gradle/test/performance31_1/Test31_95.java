package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_95 {
    private final Production31_95 production = new Production31_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}