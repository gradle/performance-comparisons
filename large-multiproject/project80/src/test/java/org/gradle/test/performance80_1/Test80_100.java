package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_100 {
    private final Production80_100 production = new Production80_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}