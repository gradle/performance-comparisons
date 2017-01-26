package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_147 {
    private final Production31_147 production = new Production31_147("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}