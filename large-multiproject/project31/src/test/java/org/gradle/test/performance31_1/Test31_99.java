package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_99 {
    private final Production31_99 production = new Production31_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}