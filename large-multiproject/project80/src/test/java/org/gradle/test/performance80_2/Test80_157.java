package org.gradle.test.performance80_2;

import static org.junit.Assert.*;

public class Test80_157 {
    private final Production80_157 production = new Production80_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}