package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_246 {
    private final Production80_246 production = new Production80_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}