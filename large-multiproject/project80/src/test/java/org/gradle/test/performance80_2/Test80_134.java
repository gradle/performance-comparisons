package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_134 {
    private final Production80_134 production = new Production80_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}