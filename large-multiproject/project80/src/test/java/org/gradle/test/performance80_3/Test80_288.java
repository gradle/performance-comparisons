package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_288 {
    private final Production80_288 production = new Production80_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}