package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_25 {
    private final Production31_25 production = new Production31_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}