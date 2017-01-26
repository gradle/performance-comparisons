package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_96 {
    private final Production31_96 production = new Production31_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}