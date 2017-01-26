package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_97 {
    private final Production80_97 production = new Production80_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}