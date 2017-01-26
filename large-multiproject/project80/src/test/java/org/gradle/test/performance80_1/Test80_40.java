package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_40 {
    private final Production80_40 production = new Production80_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}