package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_29 {
    private final Production31_29 production = new Production31_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}