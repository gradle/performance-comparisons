package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_27 {
    private final Production80_27 production = new Production80_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}