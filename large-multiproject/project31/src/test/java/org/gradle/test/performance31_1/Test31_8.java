package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_8 {
    private final Production31_8 production = new Production31_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}