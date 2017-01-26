package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_88 {
    private final Production31_88 production = new Production31_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}