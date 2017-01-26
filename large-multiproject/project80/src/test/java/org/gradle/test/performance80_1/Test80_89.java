package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_89 {
    private final Production80_89 production = new Production80_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}