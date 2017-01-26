package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_34 {
    private final Production31_34 production = new Production31_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}