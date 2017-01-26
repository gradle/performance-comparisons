package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_80 {
    private final Production31_80 production = new Production31_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}