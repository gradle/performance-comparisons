package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_134 {
    private final Production31_134 production = new Production31_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}