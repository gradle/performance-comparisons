package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_51 {
    private final Production80_51 production = new Production80_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}