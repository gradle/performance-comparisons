package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_91 {
    private final Production31_91 production = new Production31_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}