package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_471 {
    private final Production31_471 production = new Production31_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}