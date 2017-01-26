package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_68 {
    private final Production80_68 production = new Production80_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}