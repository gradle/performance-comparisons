package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_365 {
    private final Production31_365 production = new Production31_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}