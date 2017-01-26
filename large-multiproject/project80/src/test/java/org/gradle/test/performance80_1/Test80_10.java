package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_10 {
    private final Production80_10 production = new Production80_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}