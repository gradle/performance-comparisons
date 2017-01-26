package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_405 {
    private final Production31_405 production = new Production31_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}