package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_200 {
    private final Production80_200 production = new Production80_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}