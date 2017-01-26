package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_225 {
    private final Production80_225 production = new Production80_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}