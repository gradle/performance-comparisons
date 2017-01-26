package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_41 {
    private final Production31_41 production = new Production31_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}