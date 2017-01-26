package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_209 {
    private final Production80_209 production = new Production80_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}