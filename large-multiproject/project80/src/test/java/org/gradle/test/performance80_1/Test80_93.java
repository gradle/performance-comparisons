package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_93 {
    private final Production80_93 production = new Production80_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}