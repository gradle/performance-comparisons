package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_78 {
    private final Production80_78 production = new Production80_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}