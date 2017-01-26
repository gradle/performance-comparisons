package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_38 {
    private final Production31_38 production = new Production31_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}