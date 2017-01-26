package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_476 {
    private final Production31_476 production = new Production31_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}