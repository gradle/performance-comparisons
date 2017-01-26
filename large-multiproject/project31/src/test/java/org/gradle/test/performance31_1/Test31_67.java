package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_67 {
    private final Production31_67 production = new Production31_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}