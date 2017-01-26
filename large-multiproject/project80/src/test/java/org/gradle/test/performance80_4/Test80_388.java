package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_388 {
    private final Production80_388 production = new Production80_388("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}