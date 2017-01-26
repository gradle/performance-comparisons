package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_42 {
    private final Production31_42 production = new Production31_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}