package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_75 {
    private final Production80_75 production = new Production80_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}