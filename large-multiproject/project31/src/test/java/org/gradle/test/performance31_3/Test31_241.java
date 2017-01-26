package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_241 {
    private final Production31_241 production = new Production31_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}