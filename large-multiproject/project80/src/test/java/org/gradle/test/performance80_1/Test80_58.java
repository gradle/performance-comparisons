package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_58 {
    private final Production80_58 production = new Production80_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}