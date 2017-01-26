package org.gradle.test.performance80_4;

import static org.junit.Assert.*;

public class Test80_356 {
    private final Production80_356 production = new Production80_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}